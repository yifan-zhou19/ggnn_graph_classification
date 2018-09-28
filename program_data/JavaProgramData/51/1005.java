public class Ans
{
	public String str = new String(new char[5]);
	public int times;
}

package <missing>;

public class GlobalMembers
{
	public static Ans[] answer = tangible.Arrays.initializeWithDefaultAnsInstances(260);
	public static int Main()
	{
		String a = new String(new char[500]);
		String temp = new String(new char[5]);
		int n;
		int i;
		int j;
		int len;
		int p = 0;
		int q;
		int max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 0; i <= len - n; i++)
		{
			for (j = 0; j < n; j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, a.charAt(j + i));
			}
			temp = tangible.StringFunctions.changeCharacter(temp, n, '\0');
			if (p == 0)
			{
				answer[p].str = temp;
				answer[p].times = 1;
				p++;
			}
			else
			{
				for (q = 0; q < p; q++)
				{
					if (strcmp(answer[q].str, temp) == 0)
					{
						answer[q].times++;
						q = -1;
						break;
					}
				}
				if (q == p)
				{
					answer[p].str = temp;
					answer[p].times = 1;
					p++;
				}
			}
		}
		for (i = 0; i < p; i++)
		{
			if (answer[i].times > max)
			{
				max = answer[i].times;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
		for (i = 0; i < p; i++)
		{
			if (answer[i].times == max)
			{
				System.out.print(answer[i].str);
				System.out.print("\n");
			}
		}
		}
		return 0;
	}
}

