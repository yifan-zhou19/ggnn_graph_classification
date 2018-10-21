package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		String c = new String(new char[300]);
		int num = 0;
		int i;
		int j;
		int flag = 0;
		int t;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
			if (c.charAt(i) == ',')
			{
				num++;
			}
			else
			{
				break;
			}
		}
		num = num + 1;
		if (num == 1)
		{
			System.out.print("No\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		for (i = 0;i < num;i++)
		{
			if (a[i] != a[0])
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		for (i = 1;i < num;i++)
		{
			for (j = 0;j < num - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 1;i < num;i++)
		{
			if (a[i] != a[0])
			{
				System.out.printf("%d\n",a[i]);
				break;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
		return 0;
	}


}

