import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int s = 0;
		int d = 0;
		String words = new String(new char[101]);
		words = new Scanner(System.in).nextLine();
		j = 0;
		for (n = 0;words.charAt(n) != '\0';n++)
		{
			;
		}
		//cout<<n<<endl;
		//cout<<words[13]<<endl;
		for (i = n - 1;i >= 0;i--)
		{
			if (words.charAt(i) == 32)
			{
				for (k = i + 1;k <= i + j;k++)
				{
					System.out.print(words.charAt(k));
				}
				if (d == 0)
				{
					System.out.print(" ");
					d = 1;
				}
				s = 1;
				j = 0;
			}
			if (i == 0)
			{
				if (s == 1)
				{
				for (k = i;k <= j - 1;k++)
				{
					System.out.print(words.charAt(k));
				}
				}
				if (s == 0)
				{
					System.out.print(words);
				}
			}
			j++;
		}
		return 0;
	}

}
