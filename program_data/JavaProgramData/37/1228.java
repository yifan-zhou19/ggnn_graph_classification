package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] arr = new int[26];
		int i;
		int j;
		int t;
		int n = 1;
		int min;
		int[] num = new int[26];
		String s = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (j = 0;j < 26;j++)
			{
				arr[j] = 0;
				num[j] = 0;
			}
			for (j = 0;j < s.length();j++)
			{
				if (arr[s.charAt(j) - 97] == 0)
				{
				num[s.charAt(j) - 97] = n;
				n++;
				arr[s.charAt(j) - 97] = 1;
				}
				else
				{
				num[s.charAt(j) - 97] = 0;
				}
			}
			//for (j=0;j<25;j++)
			  //  printf("%d\n",num[j]);
			j = 0;
			while (num[j] == 0)
			{
				  j++;
			}
			min = j;
			for (j = min + 1;j < 26;j++)
			{
				if ((num[j] < num[min]) && (num[j]>0))
				{
				   min = j;
				}
			}
			if (min < 26)
			{
			System.out.printf("%c\n",min + 97);
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

