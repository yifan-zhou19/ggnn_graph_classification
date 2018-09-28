package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  float gpa;
	  float sum = 0F;
	  float all = 0F;
	  float final;
	  int[] point = new int[20];
	  int[] mark = new int[20];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			point[i] = Integer.parseInt(tempVar2);
		}
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  mark[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = 1;i <= n;i++)
	  {
		if (mark[i] >= 90)
		{
			gpa = 4.0F;
		}
		else if (mark[i] >= 85)
		{
			gpa = 3.7F;
		}
		else if (mark[i] >= 82)
		{
			gpa = 3.3F;
		}
		else if (mark[i] >= 78)
		{
			gpa = 3.0F;
		}
		else if (mark[i] >= 75)
		{
			gpa = 2.7F;
		}
		else if (mark[i] >= 72)
		{
			gpa = 2.3F;
		}
		else if (mark[i] >= 68)
		{
			gpa = 2.0F;
		}
		else if (mark[i] >= 64)
		{
			gpa = 1.5F;
		}
		else if (mark[i] >= 60)
		{
			gpa = 1.0F;
		}
		else
		{
			gpa = 0F;
		}
		all = all + point[i] * gpa;
		sum += point[i];
	  }
	  final = all / sum;
	  System.out.printf("%.2f",final);
	}
}

