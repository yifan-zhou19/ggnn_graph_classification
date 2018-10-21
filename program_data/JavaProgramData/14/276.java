public class student
{
	   public String num = new String(new char[10]);
	   public int[] grade = new int[2];
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		int n;
		int[] sum = new int[100000];
		int i;
		int count;
		int max;
		int j;
		count = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  sum[i] = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  stu[i].num = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  stu[i].grade[0] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  stu[i].grade[1] = Integer.parseInt(tempVar4);
		  }
		  sum[i] = stu[i].grade[0] + stu[i].grade[1];
		}
		while (count <= 2)
		{
		  max = 0;
		  for (i = 0;i < n;i++)
		  {
			if (sum[i] > max)
			{
			max = sum [i];
			j = i;
			}
		  }
		  System.out.printf("%s %d\n",stu[j].num,sum[j]);
		  count++;
		  sum[j] = 0;
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (sum[i] > max)
			{
			max = sum [i];
			j = i;
			}
		}
		  System.out.printf("%s %d",stu[j].num,sum[j]);
		System.in.read();
		System.in.read();
	}

}

