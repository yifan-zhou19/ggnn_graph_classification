import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		int i;
		int j;
		int k;
		int flag = 1;
		int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();




		for (i = 0;i <= s.length();i++)
		{
			flag = 1;
			if (s.charAt(i) || s.charAt(i + 1))
			{
			if (s.charAt(i - 1) == 32 || i == 0)
			{
			for (j = 0;a.charAt(j) != 0;j++)
			{
				if (s.charAt(i + j) == a.charAt(j))
				{
				continue;
				}
				else
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				i += j - 1;
				for (k = 0;b.charAt(k) != 0;k++)
				{
				System.out.print(b.charAt(k));
				}


			}
			else
			{
				if (s.charAt(i) == 0)
				{
					System.out.print(" ");
				}
				else
				{

				System.out.print(s.charAt(i));
				}
			}
			}



			else
			{
				System.out.print(s.charAt(i));
			}
			}

		}








		return 0;
	}





}
