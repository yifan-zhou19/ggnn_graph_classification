package <missing>;

public class GlobalMembers
{
	/* Author: Xiong Shihao (xsh@pku.edu.cn)
	 * ID: 1000010177
	 * Compiler: gcc
	 */


	public static int Main()
	{
		int y = 0;
		int m = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (m == 1 || m == 2)
		{
					  m = m + 12;
					  y--;
		}
		int week = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7; //???????????
		switch (week)
		{
					case 0:
						System.out.print("Mon.");
						break;
					case 1:
						System.out.print("Tue.");
						break;
					case 2:
						System.out.print("Wed.");
						break;
					case 3:
						System.out.print("Thu.");
						break;
					case 4:
						System.out.print("Fri.");
						break;
					case 5:
						System.out.print("Sat.");
						break;
					case 6:
						System.out.print("Sun.");
						break;
		}
	   return 0;
	}
}

