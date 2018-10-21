public class student
{
	public String name = new String(new char[30]);
public int qimo;
public int banji;
public char gb;
public char xb;
public int lw;
}

package <missing>;

public class GlobalMembers
{
	public static int k = 0;
	public static void Main()
	{

	int money = struct student a;
	int cmp = new int(int a[],int n);
	int n;
	int i;
	int[] b = new int[200];
	int m;
	int q = 0;
	  student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(105);
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
			  a[i].name = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i].qimo = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  a[i].banji = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar5 != null)
		  {
			  a[i].gb = tempVar5.charAt(0);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar6 != null)
		  {
			  a[i].xb = tempVar6.charAt(0);
		  }
		  String tempVar7 = ConsoleInput.scanfRead(" ");
		  if (tempVar7 != null)
		  {
			  a[i].lw = Integer.parseInt(tempVar7);
		  }
		  b[i] = money(a[i]);
		  q = q + b[i];
	  }
	 m = cmp(b, n);
	  System.out.printf("%s\n",a[k].name);
	  System.out.printf("%d\n",m);
	  System.out.printf("%ld",q);
	}




	public static int money(student a)
	{
		int sum = 0;
		if (a.qimo > 80 && a.lw >= 1)
		{
			sum = 8000;
		}
		if (a.banji > 80 && a.qimo > 85)
		{
			sum = sum + 4000;
		}
		if (a.qimo > 90)
		{
			sum = sum + 2000;
		}
		if (a.qimo > 85 && a.xb == 'Y')
		{
			sum = sum + 1000;
		}
		if (a.banji > 80 && a.gb == 'Y')
		{
			sum = sum + 850;
		}
		return sum;
	}

	public static int cmp(int[] a, int n)
	{
		int max = a[0];
		int i;
		for (i = 0;i < n - 1;i++)
		{
			if (max < a[i + 1])
			{
			max = a[i + 1];
			k = i + 1;
			}
		}
		return max;
	}

}

