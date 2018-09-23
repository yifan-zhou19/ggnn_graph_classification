package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		int r;
		if (((float)a) - ((float)b) < 0)
		{
			r = -1;
		}
		else if (((float)a) - ((float)b) == 0)
		{
				r = 0;
		}
		else
		{
			r = 1;
		}
		return r;
	}
	public static int cmp2(Object a, Object b)
	{
		int r;
		if ((float)a - (float)b > 0)
		{
			r = -1;
		}
		else if ((float)a - (float)b == 0)
		{
				r = 0;
		}
			else
			{
				r = 1;
			}
		return r;
	}
	public static int Main()
	{
		int n;
		int i;
		int x = 0;
		int y = 0;
		float h;
		String temp = new String(new char[10]);
		String[] sex = {"male", "female"};
		float[][] height = new float[2][40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Float.parseFloat(tempVar3);
			}
			if (strcmp(temp,sex[0]) == 0)
			{
				height[0][x] = h;
				x++;
			}
			else
			{
				height[1][y] = h;
				y++;
			}
		}
		qsort(height[0],x,(Float.SIZE / Byte.SIZE),cmp);
		qsort(height[1],y,(Float.SIZE / Byte.SIZE),cmp2);
		for (i = 0;i < x;i++)
		{
			System.out.printf("%.2f ",height[0][i]);
		}
		for (i = 0;i < y;i++)
		{
			if (i != y - 1)
			{
				System.out.printf("%.2f ",height[1][i]);
			}
			else
			{
				System.out.printf("%.2f",height[1][i]);
			}
		}
		return 0;
	}
}

