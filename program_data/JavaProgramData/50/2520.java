package <missing>;

public class GlobalMembers
{
	public static void panduan(int i, int num)
	{

		if (num % 7 == 5)
		{
			System.out.printf("%d\n",i);
		}
	}
	public static int i;
	public static int num;
	public static int Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		i = 1;
		num = (13 + w - 1);
		panduan(i, num);
		i++;
		num = num + 31;
		panduan(i, num);
		i++;
		num = num + 28;
		panduan(i, num);
		i++;
		num = num + 31;
		panduan(i, num);
		i++;
		num = num + 30;
		panduan(i, num);
		i++;
		num = num + 31;
		panduan(i, num);
		i++;
		num = num + 30;
		panduan(i, num);
		i++;
		num = num + 31;
		panduan(i, num);
		i++;
		num = num + 31;
		panduan(i, num);
		i++;
		num = num + 30;
		panduan(i, num);
		i++;
		num = num + 31;
		panduan(i, num);
		i++;
		num = num + 30;
		panduan(i, num);
		i++;
	}

}

