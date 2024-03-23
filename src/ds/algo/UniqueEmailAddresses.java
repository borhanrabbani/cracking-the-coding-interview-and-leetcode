package ds.algo;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public static int numUniqueEmails(String[] emails) {
		Set<String> emailSet = new HashSet<>();
		
		for(String email: emails) {
			String[] parts = email.split("@");
			String[] local = parts[0].split("\\+");
			emailSet.add(local[0].replace(".", "")+"@"+parts[1]);
		}
		for(String email: emailSet) {
			System.out.println(email);
		}
		
		return emailSet.size();
	}

	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emails));

	}

}
