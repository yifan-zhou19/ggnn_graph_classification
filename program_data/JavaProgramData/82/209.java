package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int s;
		int n;
		int t;
		s = 0;
		t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pulse
	//	{
	//		   int x;
	//		   int y;
	//	}
	//	a[n];
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i].x = tempVar2;
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 a[i].y = tempVar3;
						 }
		}
		for (i = 1;i <= n;i++)
		{
						 if (a[i].x <= 140 && a[i].x >= 90 && a[i].y <= 90 && a[i].y >= 60)
						 {
							 s++;
							 if (t < s)
							 {
								 t = s;
							 }
						 }
						 else
						 {
							 s = 0;
						 }
		}
		System.out.printf("%d",t);

		return 0;

	}

}

