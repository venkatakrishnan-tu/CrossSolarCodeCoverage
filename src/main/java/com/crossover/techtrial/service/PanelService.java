package com.crossover.techtrial.service;

import java.util.List;

import com.crossover.techtrial.model.Panel;

/**
 * PanelService interface for Panels.
 * @author Crossover
 *
 */
public interface PanelService {
  
	  /**
	   * Register a panel for electricity monitoring.
	   * @param panel to register with system.
	   */
	  Panel register(Panel panel);

	  /**
	   * Find a {@link Panel} by its serial.
	   *
	   * @param serial The serial
	   * @return The {@link Panel}
	   */
	  Panel getBySerial(String serial);

	  /**
	   * Returns all panels.
	   *
	   * @return List of {@link Panel}
	   */
	 
	  List<Panel> getAll();
}
