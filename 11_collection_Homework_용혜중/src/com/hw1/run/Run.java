package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		Friend friend = new Friend();
		
		List<Friend> friendList = new ArrayList<Friend>();
		
		friendList.add(new Friend("짱구"));
		friendList.add(new Friend("철수"));
		friendList.add(new Friend("유리"));
		friendList.add(new Friend("훈이"));
		friendList.add(new Friend("맹구"));
		
		Friend leader = friendList.get(friend.pickLeader());
		System.out.println(leader.getName() + "가 떡잎방범대 대장이다!");

	}

}
