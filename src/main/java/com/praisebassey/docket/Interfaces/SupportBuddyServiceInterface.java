package com.praisebassey.docket.Interfaces;

import com.praisebassey.docket.Models.SupportBuddy;
import com.praisebassey.docket.Models.Task;

import java.util.List;

public interface SupportBuddyServiceInterface {
    SupportBuddy createSupportBuddy(SupportBuddy buddy);
    SupportBuddy viewSupportBuddy(String id);
    List<SupportBuddy> viewSupportBuddies();
    SupportBuddy updateSupportBuddy(SupportBuddy buddy);
    void deleteSupportBuddy(String id);
}
