package <missing>;

public class GlobalMembers
{
	public static int kuso(int x)
	{
		int i;
		for (i = 0;;i++)
		{
		if (x >= Math.pow(2,i - 1) && x < Math.pow(2,i))
		{
			break;
		}
		}
		return (i);
	}
	public static void Main()
	{
		int a;
		int b;
		int a1;
		int b1;
		int[] a2 = new int[100];
		int[] b2 = new int[100];
		int b3;
		int a3;
		int i;
		int j;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		a1 = kuso(a);
		b1 = kuso(b);
		x = a1;
		y = b1;
		while (a1 != 0)
		{
			a2[a1] = a;
			a3 = (a - Math.pow(2,a1 - 1)) / 2 + Math.pow(2,a1 - 2);
			a = a3;
			a1--;
		}
		while (b1 != 0)
		{
			b2[b1] = b;
			b3 = (b - Math.pow(2,b1 - 1)) / 2 + Math.pow(2,b1 - 2);
			b = b3;
			b1--;
		}

		for (i = x;i > 0;i--)
		{
			for (j = y;j > 0;j--)
			{
				if (a2[i] == b2[j])
				{
					System.out.printf("%d",a2[i]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	System.out.print("\n");
	}




}

