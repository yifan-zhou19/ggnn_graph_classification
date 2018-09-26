package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] huiwen = {11, 101, 131, 151, 181, 191, 313, 353, 373, 383, 727, 757, 787, 797, 919, 929, 10301, 10501, 10601, 11311, 11411, 12421, 12721, 12821, 13331, 13831, 13931, 14341, 14741};
		int m;
		int n;
		int i;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 29;i++)
		{
		if (huiwen[i] >= m != 0 && huiwen[i] <= n)
		{
			 count = i;
			 break;
		}
		}
		 for (i = 1;i < 29;i++)
		 {
			 if (count == 0)
			 {
			 System.out.print("no");
			 break;
			 }
		 if (huiwen[i] >= m != 0 && huiwen[i] <= n != 0 && i != count)
		 {
		 System.out.printf(",%d",huiwen[i]);
		 }
		 if (huiwen[i] >= m != 0 && huiwen[i] <= n != 0 && i == count)
		 {
		 System.out.printf("%d",huiwen[i]);
		 }
		 }
		 System.in.read();
		 System.in.read();
	}

}

