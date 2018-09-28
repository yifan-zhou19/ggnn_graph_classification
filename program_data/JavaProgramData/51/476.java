package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int flag;
		int len;
		int start;
		int end;
		int max = 0;
		int[] num = new int[501];
		String str = new String(new char[501]);
		char[][] t =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
		String temp = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (start = 0;start <= len - n;start++)
		{
			for (i = 0;i < 5;i++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
			}
			flag = 0;
			end = start + n - 1;
			j = 0;
			for (i = start;i <= end;i++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, str.charAt(i));
				j++;
			}
			for (i = 0;i <= k;i++)
			{
				if (strcmp(temp,t[i]) == 0)
				{
					num[i]++;
					flag = 1;
					break;
				}
				else
				{
					continue;
				}
			}
			if (flag == 0)
			{
				t[k] = temp;
				num[k]++;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",max);
		for (i = 0;i < k;i++)
		{
		//	printf("%d",num[i]);
		if (num[i] == max)
		{
				System.out.println(t[i]);
		}
		}
		return 0;
	}
}

