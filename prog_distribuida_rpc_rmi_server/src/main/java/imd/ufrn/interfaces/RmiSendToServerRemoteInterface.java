package imd.ufrn.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiSendToServerRemoteInterface extends Remote {
    public String messageToServer(String message) throws RemoteException;
}
