public class chengji
{
	public int xh;
	public int yw;
	public int sx;
	public int zf;
	public chengji next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int max1;
	public static int xue1;
	public static int max2;
	public static int xue2;
	public static int max3;
	public static int xue3;

	public static void create()
	{
		chengji head;
		chengji p1;
		int i = 0;
		while (i < n)
		{
			i++;
			if (i == 1)
			{
				head = p1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (chengji)malloc(len);
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  p1.xh = Integer.parseInt(tempVar);
				  }
				  String tempVar2 = ConsoleInput.scanfRead(" ");
				  if (tempVar2 != null)
				  {
					  p1.yw = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  p1.sx = Integer.parseInt(tempVar3);
				  }
				  p1.zf = p1.yw + p1.sx;
				  if ((p1.zf) > max1)
				  {
					   xue3 = xue2;
					   max3 = max2;
					   xue2 = xue1;
					   max2 = max1;
					   xue1 = p1.xh;
					   max1 = p1.zf;

				  }
				  else
				  {
					  if ((p1.zf) > max2 && (p1.zf) <= max1)
					  {
					  xue3 = xue2;
					  max3 = max2;
					  xue2 = p1.xh;
					  max2 = p1.zf;
					  }
				  else
				  {
					  if ((p1.zf) > max3 && (p1.zf) <= max2)
					  {
					  xue3 = p1.xh;
					  max3 = p1.zf;
					  }
				  }
				  }

			p1 = p1.next;
		}
	}

	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max1 = 0,max2 = 0,max3 = 0;
		create();
		System.out.printf("%d %d\n",xue1,max1);
		System.out.printf("%d %d\n",xue2,max2);
		System.out.printf("%d %d",xue3,max3);
	}
}

