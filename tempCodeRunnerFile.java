
            trail++;

            if (guess < randNumber) {
                System.out.println("The number you have entered is less than the number ! please try again ");
            } else if (guess > randNumber) {
                System.out.println("The number you have entered is Greater than the number ! please try again ");
            } else {
                hasGuessed = true;
            }
        }

        System.out.println("Congratulations ! you found the number : "+randNumber + " in " + trail);
        System.out.println();
        sc.close();
    }
}
