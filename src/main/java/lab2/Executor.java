package lab2;

import lab2.constants.Constants;
import lab2.model.ChordModel;

public class Executor {

    public static void main(String[] args) {
        // 1. Create system
        ChordModel chordModel = new ChordModel(Constants.INITIAL_SYSTEM_BIT_SIZE, Constants.INITIAL_NODES_POSITION);
        chordModel.printSystem("#1. Created system");

        // 2. Add node
        chordModel.addNode(Constants.NODE_POSITION_TO_ADD);
        chordModel.printSystem("#2. System with new node");

        // 3. Remove node
        chordModel.removeNode(Constants.NODE_POSITION_TO_REMOVE);
        chordModel.printSystem("#3. System without one node");

        // 4. Search node
        System.out.println(chordModel.findNode(Constants.NODE_POSITION_START_SEARCH, Constants.NODE_POSITION_TO_SEARCH));
    }
}
