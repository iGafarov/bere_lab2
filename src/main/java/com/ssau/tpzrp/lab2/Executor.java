package com.ssau.tpzrp.lab2;

import com.ssau.tpzrp.lab2.model.ChordModel;

import static com.ssau.tpzrp.lab2.constants.Constants.*;
import static com.ssau.tpzrp.lab2.constants.Constants.NODE_POSITION_TO_SEARCH;

public class Executor {

    public static void main(String[] args) {
        // 1. Create system
        ChordModel chordModel = new ChordModel(INITIAL_SYSTEM_BIT_SIZE, INITIAL_NODES_POSITION);
        chordModel.printSystem("#1. Created system");

        // 2. Add node
        chordModel.addNode(NODE_POSITION_TO_ADD);
        chordModel.printSystem("#2. System with new node");

        // 3. Remove node
        chordModel.removeNode(NODE_POSITION_TO_REMOVE);
        chordModel.printSystem("#3. System without one node");

        // 4. Search node
        System.out.println(chordModel.findNode(NODE_POSITION_START_SEARCH, NODE_POSITION_TO_SEARCH));
    }
}
