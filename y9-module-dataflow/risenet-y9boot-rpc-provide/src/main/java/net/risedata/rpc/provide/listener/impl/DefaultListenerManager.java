package net.risedata.rpc.provide.listener.impl;

import io.netty.channel.socket.SocketChannel;
import net.risedata.rpc.provide.listener.Listener;
import net.risedata.rpc.provide.listener.ListenerManager;
import net.risedata.rpc.provide.net.ClinetConnection;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: 安全管理器默认的实现
 * @Author lb176
 * @Date 2021/4/29==10:04
 */
public class DefaultListenerManager implements ListenerManager {

    private List<Listener> listeners;

    @Override
    public void onConnection(ClinetConnection clinetConnection) {
        if (listeners != null) {
            for (Listener filter : listeners) {
                filter.onConnection(clinetConnection);

            }
        }
    }

    @Override
    public void onClosed(ClinetConnection clinetConnection) {
        if (listeners != null) {
            for (Listener filter : listeners) {
                filter.onClosed(clinetConnection);

            }
        }
    }

    @Override
    public void addListener(Listener filter) {
        if (listeners == null) {
            synchronized (this) {
                if (listeners == null) {
                    listeners = new LinkedList<>();
                }
            }
        }
        listeners.add(filter);
    }
}
