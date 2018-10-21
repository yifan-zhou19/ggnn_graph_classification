public class stu
{
 public String name = new String(new char[25]);
 public int score1;
 public int score2;
 public char a;
 public char b;
 public int num;
 public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int n;
	 int t = 0;
	 int pos;
	 int max;
	 stu[] p1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 p1 = tangible.Arrays.initializeWithDefaultstuInstances(n);
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p1[i].name = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  (p1[i].score1) = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  (p1[i].score2) = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar5 != null)
	  {
		  (p1[i].a) = tempVar5.charAt(0);
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar6 != null)
	  {
		  (p1[i].b) = tempVar6.charAt(0);
	  }
	  String tempVar7 = ConsoleInput.scanfRead(" ");
	  if (tempVar7 != null)
	  {
		  (p1[i].num) = Integer.parseInt(tempVar7);
	  }
	  if (p1[i].score1 > 80 && p1[i].num >= 1)
	  {
		p1[i].sum += 8000;
		t += 8000;
	  }
	  if (p1[i].score1 > 85 && p1[i].score2 > 80)
	  {
		p1[i].sum += 4000;
		t += 4000;
	  }
	  if (p1[i].score1 > 90)
	  {
		p1[i].sum += 2000;
		t += 2000;
	  }
	  if (p1[i].score1 > 85 && p1[i].b == 'Y')
	  {
		p1[i].sum += 1000;
		t += 1000;
	  }
	  if (p1[i].score2 > 80 && p1[i].a == 'Y')
	  {
		p1[i].sum += 850;
		t += 850;
	  }
	 }
	 max = p1[0].sum;
	 for (i = 1;i < n;i++)
	 {
	  if (p1[i].sum > max)
	  {
		pos = i;
		max = p1[i].sum;
	  }
	 }
	 System.out.printf("%s\n%d\n%d",p1[pos].name,p1[pos].sum,t);
	}


}

