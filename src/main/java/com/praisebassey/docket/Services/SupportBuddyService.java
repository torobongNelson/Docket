package com.praisebassey.docket.Services;

import com.praisebassey.docket.Interfaces.SupportBuddyServiceInterface;
import com.praisebassey.docket.Models.SupportBuddy;
import com.praisebassey.docket.Repositories.SupportBuddyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportBuddyService implements SupportBuddyServiceInterface {

    private final SupportBuddyRepository supportBuddyRepository;

    public SupportBuddyService(SupportBuddyRepository supportBuddyRepository) {
        this.supportBuddyRepository = supportBuddyRepository;
    }

    @Override
    public SupportBuddy createSupportBuddy(SupportBuddy buddy) {
        return supportBuddyRepository.save(buddy);
    }

    @Override
    public SupportBuddy viewSupportBuddy(String id) {
        return supportBuddyRepository.findById(id).orElseThrow(()-> new RuntimeException("SupportBuddy not found"));
    }

    @Override
    public List<SupportBuddy> viewSupportBuddies() {
        return supportBuddyRepository.findAll();
    }

    @Override
    public SupportBuddy updateSupportBuddy(SupportBuddy buddy) {
        return supportBuddyRepository.save(buddy);
    }

    @Override
    public void deleteSupportBuddy(String id) {
            supportBuddyRepository.deleteById(id);
    }
}
