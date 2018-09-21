package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		String str = new String(new char[10000]);
		int i;
		int[] num = new int[300];
		int j;
		int add = 0;
		int count = 0;
		int no;
		int tag = 0;
		int flag;
		int max;
		for (i = 0;i < 300;i++)
		{
			num[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == 44)
			{
				count++;
			}
		}
		i = 0;
		for (j = 0;j < count;j++)
		{
			for (;str.charAt(i) != 44;i++)
			{
				add = add * 10 + str.charAt(i) - '0';
			}
			i++;
			num[j] = add;
			add = 0;
		}
		for (;i < str.length();i++)
		{
			num[j] = 10 * num[j] + str.charAt(i) - '0';
		}
		/*for(i=0;i<=j;i++)
			printf("%d\n",num[i]);*/


	if (j == 1)
	{
			System.out.print("No\n");
	}
		no = j + 1;
		for (i = 0, flag = 1;i < no && flag != 0;i++)
		{
			if (num[i] != num[0])
			{
				flag = 0;
			}
		}
		if (flag != 0)
		{
			System.out.print("No\n");
		}
		else
		{
			max = 0;

			for (i = 0;i < no;i++)
			{
				if (num[i] >= max)
				{
				max = num[i];
				tag = i;
				}
			}

			for (i = 0;i < no;i++)
			{
				if (num[i] == num[tag])
				{
			num[i] = 0;
				}
			}


			for (i = 0,max = num[0];i < no;i++)
			{
				if (num[i] > max)
				{
					max = num[i];
				tag = i;
				}
			}
			System.out.printf("%d\n",max);
		}
	}
}

