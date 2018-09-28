public class stu
{
	public String name = new String(new char[100]);
  public int qm;
  public int py;
  public char gb;
  public char xb;
  public int lw;
  public int jj;
}

package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[101];
	public static int Main()
	{
		void pai(struct stu s[],int n,int a[]);
	  stu[] s = tangible.Arrays.initializeWithDefaultstuInstances(101);
	  int i = 0;
	  int n = 0;
	  int sum = 0;
	  final String m = "";
	  for (i = 0;i < 101;i++)
	  {
		  s[i].name = m;
		s[i].qm = 0;
		s[i].py = 0;
		s[i].gb = '\0';
		s[i].xb = '\0';
		s[i].lw = 0;
		s[i].jj = 0;
	  }
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
				s[i].name = tempVar2.charAt(0);
			}
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  s[i].qm = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  s[i].py = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar5 != null)
		  {
			  s[i].gb = tempVar5.charAt(0);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar6 != null)
		  {
			  s[i].xb = tempVar6.charAt(0);
		  }
		  String tempVar7 = ConsoleInput.scanfRead(" ");
		  if (tempVar7 != null)
		  {
			  s[i].lw = Integer.parseInt(tempVar7);
		  }
		  if (s[i].qm > 80 && s[i].lw >= 1)
		  {
			  s[i].jj = s[i].jj + 8000;
		  }
		  if (s[i].qm > 85 && s[i].py > 80)
		  {
			  s[i].jj = s[i].jj + 4000;
		  }
		  if (s[i].qm > 90)
		  {
			  s[i].jj = s[i].jj + 2000;
		  }
		  if (s[i].xb == 'Y' && s[i].qm > 85)
		  {
			  s[i].jj = s[i].jj + 1000;
		  }
		  if (s[i].py > 80 && s[i].gb == 'Y')
		  {
			  s[i].jj = s[i].jj + 850;
		  }
			sum = sum + s[i].jj;
			a[i] = i;
		}
		pai(s, n, a);
		System.out.printf("%s\n",s[a[0]].name);
		System.out.printf("%d\n",s[a[0]].jj);
		System.out.printf("%d",sum);


		return (0);
	}
	public static void pai(stu[] s, int n, int[] a)
	{
		int t = 0;
	  int i = 0;
	  int j = 0;
	  for (i = 0;i < n;i++)
	  {
		   for (j = 0;j < n - i - 1;j++)
		   {
			  if (s[a[j]].jj < s[a[j + 1]].jj)
			  {
				 t = a[j];
			   a[j] = a[j + 1];
			   a[j + 1] = t;
			  }
		   }
	  }
	}
}

