import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int judge(String a)
	{
		int b = 0;
		int i = 0;
		if (a[0].compareTo(64) > 0 && a[0].compareTo(91) < 0 || a[0].compareTo(96) > 0 && a[0].compareTo(123) < 0 || a[0].equals('_'))
		{
			b = 1;
		}
		if (b == 1)
		{
		  for (i = 1; !a[i].equals('\0');i++)
		  {
		   if (a[i].compareTo(48) < 0 || (a[i].compareTo(57) > 0 && a[i].compareTo(65) < 0) || (a[i].compareTo(90) > 0 && a[i].compareTo(97) < 0 && !a[i].equals(95)) || (a[i].compareTo(122) > 0))
		   {
			b = 0;
		   }
		  }
		}
		 return b;
	}
	public static int Main()
	{
		int n = 0;
		int i = 0;
		String word = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			word = new Scanner(System.in).nextLine();
			System.out.print(judge(word));
			System.out.print("\n");
		}
		return 0;
	}

}

