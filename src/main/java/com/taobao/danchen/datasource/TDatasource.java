package com.taobao.danchen.datasource;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class TDatasource implements DataSource {

	/**
	 * APIʵ��
	 */
	//jdbc�淶: DataSource�ս���ʱLogWriterΪnull
	private PrintWriter out = null;

	public PrintWriter getLogWriter() throws SQLException {
		return out;
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		this.out = out;

	}

	//jdbc�淶: DataSource�ս���ʱLoginTimeoutΪ0
	private int seconds = 0;
	
	public void setLoginTimeout(int seconds) throws SQLException {
		this.seconds = seconds;

	}

	public int getLoginTimeout() throws SQLException {
		return seconds;
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public TConnection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public TConnection getConnection(String username, String password)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
