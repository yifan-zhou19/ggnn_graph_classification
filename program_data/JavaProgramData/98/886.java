import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		int n = 0;
		int j = 0;
		int i = 0;
		int sum = 0;
		int j1 = 0;
		int j2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//cout<<n;
		System.in.read();
		a = new Scanner(System.in).nextLine();
		//cout<<'f';
		while (a.charAt(i) != '\0')
		{
			i++;
			sum++;
		}
		while (sum - j > 80)
		{
			j1 = j;
		j = j + 80;
		j2 = j;


			while (a.charAt(j) != ' ')
			{
				j--;
			}
			if (j == j2)
			{
				for (i = j1;i < j;i++)
				{
					if (i == j - 1)
					{
						System.out.print(a.charAt(i));
						System.out.print("\n");
					}
					else
					{
					System.out.print(a.charAt(i));
					}
				}
			}
			else
			{
			for (i = j1;i < j;i++)
			{
				if (i == j - 1)
				{
					System.out.print(a.charAt(i));
					System.out.print("\n");
					System.out.print("\n");
				}
				else
				{
					System.out.print(a.charAt(i));
				}
			}
			}
			j = j + 1;
		}
		for (i = j;i < sum;i++)
		{
			if (i == sum - 1)
			{
				System.out.print(a.charAt(i));
			}
			else
			{
			System.out.print(a.charAt(i));
			}
		}
		return 0;
	}

}

