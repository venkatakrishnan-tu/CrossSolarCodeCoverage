package com.crossover.techtrial.service;

import com.crossover.techtrial.model.Panel;
import com.crossover.techtrial.repository.PanelRepository;
import com.crossover.techtrial.exceptions.ResourceNotFoundException;

import static java.lang.String.format;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * PanelServiceImpl for panel related handling.
 * @author Crossover
 *
 */
@Service
public class PanelServiceImpl implements PanelService {

  @Autowired
  PanelRepository panelRepository;
   
  public PanelServiceImpl(final PanelRepository panelRepository) {
    this.panelRepository = panelRepository;
  }

  /* (non-Javadoc)
   * @see com.crossover.techtrial.service.PanelService#register(com.crossover.techtrial.model.Panel)
   */
  
  @Override
  public Panel register(Panel panel) {
    return panelRepository.save(panel);
  }

  @Override
  public Panel getBySerial(String serial) {
    Panel panel = panelRepository.findBySerial(serial);
    if (panel == null) {
      throw new ResourceNotFoundException(format("Panel '%s' was not found", serial));
    }

    return panel;
  }

  @Override
  public List<Panel> getAll() {
    return this.panelRepository.findAll();
  }
}
