import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String sen1 = new String(new char[80]);
		String sen2 = new String(new char[80]);
		sen1 = new Scanner(System.in).nextLine();
		sen2 = new Scanner(System.in).nextLine();
		int nlen1 = sen1.length();
		int nlen2 = sen2.length();
		char[] B = {'<', '=', '>'};
		for (int i = 0;i < nlen1;i++)
		{
		if (sen1.charAt(i) >= 'A' && sen1.charAt(i) <= 'Z')
		{
		sen1.charAt(i) += 'a'-'A';
		}
		}
		for (int i = 0;i < nlen2;i++)
		{
		if (sen2.charAt(i) >= 'A' && sen2.charAt(i) <= 'Z')
		{
		sen2.charAt(i) += 'a'-'A';
		}
		}
		for (int i = 0;i < nlen2;i++)
		{
		k = strcmp(sen1,sen2);
		}
		System.out.print(B[k + 1]);
		return 0;
	}

}
