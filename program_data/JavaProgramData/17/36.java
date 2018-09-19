import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String in = new String(new char[1000]);
	while (in = new Scanner(System.in).nextLine())
	{
		//cin.getline(in,100,'\n');
		if (in.charAt(0) == '\0')
		{
			break;
		}
		int len;
		len = in.length();
		int i;
		int j;
		int k;
		int[] flag = new int[100];
		for (i = 0;i <= len - 1;i++)
		{
			if (in.charAt(i) == '(')
			{
				flag[i] = 2; //2=$
			}
			if (in.charAt(i) == ')')
			{
				flag[i] = 3; //3=?
			}
		}
		for (i = len - 1;i >= 0;i--)
		{
			if (flag[i] == 1)
			{
				continue;
			}
			if (in.charAt(i) == '(')
			{
				for (j = i + 1;j <= len - 1;j++)
				{
					if (flag[j] == 1)
					{
						continue;
					}
					if (in.charAt(j) == ')')
					{
						flag[j] = 1;
						flag[i] = 1;
					}
					if (in.charAt(j) == ')')
					{
						break;
					}
				}
			}
		}
		System.out.print(in);
		System.out.print("\n");
		int temp;
		int t;
		int num = 0;
		for (i = len - 1;i >= 0;i--)
		{
			if (flag[i] == 2 || flag[i] == 3)
			{
				temp = i;
			}
			if (flag[i] == 2 || flag[i] == 3)
			{
				break;
			}
		}
		for (i = 0;i <= len - 1;i++)
		{
			if (flag[i] == 2 || flag[i] == 3)
			{
				t = i;
			}
			if (flag[i] == 2 || flag[i] == 3)
			{
				break;
			}
		}
		for (j = 0;j <= len - 1;j++)
		{
			if (flag[i] == 0 || flag[i] == 1)
			{
				num++;
			}
		}
		if (num < len)
		{

			for (i = t;i <= temp;i++)
			{
				if (flag[i] == 0 || flag[i] == 1)
				{
					System.out.print(" ");
				}
				if (flag[i] == 2)
				{
					System.out.print("$");
				}
				if (flag[i] == 3)
				{
					System.out.print("?");
				}
			}
		System.out.print("\n");
		}
	}
	return 0;
	}
}
