import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//*   ?  ?   ?: ?????C???????? .cpp        *
	//*   ?       ?: ? ?                                   *
	//*   ? ? ? ?: 2010?10?20?                          *
	//**********************************************************
	public static int Main()
	{
		int n = 0; //???????n???????h??????
		int i = 0;
		int j = 0;
		int p = 0;
		int h = 0;
		final String a = " "; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			p = 0; //??p??
			a = new Scanner(System.in).nextLine(); //?????
			for (j = 0;j < 81;j++)
			{
				if (a.charAt(j) == '\0')
				{
					h = j;
					break; //???????
				}
			}
			for (j = 0;j < h;j++)
			{
				if ((a.charAt(0) == '_') || ((a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z')) || ((a.charAt(0) <= 'z') && (a.charAt(0) >= 'a'))) //?????????????????
				{
					if (((a.charAt(j) >= 'A') && (a.charAt(j) <= 'Z')) || ((a.charAt(j) <= 'z') && (a.charAt(j) >= 'a')) || ((a.charAt(j) >= '0') && (a.charAt(j) <= '9')) || a.charAt(j) == '_')
					{
						p = 1; //????????????????????
					}
					else
					{
						p = 0;
						break; //????????????????????
					}
				}
			}
			if (p == 1) //????
			{
				System.out.print(1);
				System.out.print("\n");
			}
			if (p == 0) //?????
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

