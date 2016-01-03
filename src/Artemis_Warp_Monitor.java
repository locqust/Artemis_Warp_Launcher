
import java.io.IOException;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.dhleong.acl.enums.Console;
import net.dhleong.acl.iface.ArtemisNetworkInterface;
import net.dhleong.acl.iface.ConnectionSuccessEvent;
import net.dhleong.acl.iface.DisconnectEvent;
import net.dhleong.acl.iface.Listener;
import net.dhleong.acl.iface.ThreadedArtemisNetworkInterface;
import net.dhleong.acl.protocol.ArtemisPacket;
import net.dhleong.acl.protocol.core.setup.ReadyPacket;
import net.dhleong.acl.protocol.core.setup.SetConsolePacket;
import net.dhleong.acl.protocol.core.GameMessagePacket;
import net.dhleong.acl.protocol.core.setup.SetShipPacket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy
 */
class Artemis_Warp_Monitor {

        
        public ArtemisNetworkInterface server;

    //public Artemis_Warp_Monitor(int host, int connectport) throws IOException {
     //   String IP = Integer.toString(host);
        //String port = Integer.toString(connectport);
      //  server = new ThreadedArtemisNetworkInterface(IP, connectport);
      //  server.addListener(this);
       // server.start();
    //}

    public Artemis_Warp_Monitor(String host, int connectport) throws IOException {
        server = new ThreadedArtemisNetworkInterface(host, connectport);
        server.addListener(this);
        server.start();
    }

    @Listener
    public void onConnectSuccess(ConnectionSuccessEvent event) {
        server.send(new SetConsolePacket(Console.OBSERVER, true));
        server.send(new ReadyPacket());
        System.out.println(event);
    }

    @Listener
    public void onSetShipPacket (SetShipPacket pkt) {
            System.out.println(pkt);
}
    
          @Listener
    public void onDisconnect(DisconnectEvent event) {
        System.out.println("Disconnected: " + event.getCause());
    }
 }
    
