public class info
{
	public String name = new String(new char[30]);
	public char sit1;
	public char sit2;
	public int a;
	public int b;
	public int num;
	public int totle;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int count;
		int max = 0;
		int k;
		int i;
		int totle = 0;
		info[] str = tangible.Arrays.initializeWithDefaultinfoInstances(100);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			count = Integer.parseInt(tempVar);
		}

		for (i = 0;i < count;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				str[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				str[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				str[i].sit1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				str[i].sit2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				str[i].num = Integer.parseInt(tempVar7);
			}
			str[i].totle = 0;

			if (str[i].a > 80 && str[i].num != 0)
			{
				str[i].totle += 8000;
			}

			if (str[i].a > 85 && str[i].b > 80)
			{
				str[i].totle += 4000;
			}

			if (str[i].a > 90)
			{
				str[i].totle += 2000;
			}

			if (str[i].a > 85 && str[i].sit2 == 'Y')
			{
				str[i].totle += 1000;
			}

			if (str[i].b > 80 && str[i].sit1 == 'Y')
			{
				str[i].totle += 850;
			}
		}
		for (i = 0;i < count;i++)
		{
			totle += str[i].totle;
			if (str[i].totle > max)
			{
				max = str[i].totle;
				k = i;
			}
		}
		System.out.printf("%s\n%d\n%ld\n",str[k].name,str[k].totle,totle);
	}





}

