//! wap in java to implement user defined exception

class UnderageException extends Exception {
    String message;

    UnderageException(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}

class VotingEligibility {
    public static void main(String[] args) {
        int age = 17;

        try {
            if (age < 18) {
                throw new UnderageException("You are underage and cannot vote.");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (UnderageException e) {
            System.out.println(e);
        }
    }
}


// ?   To run the code, run the following commands:
// ?   javac UserdException.java
// ?   java VotingEligibility
