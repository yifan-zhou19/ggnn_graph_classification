public class student
{
	public String name = new String(new char[22]);
	public int qimo;
	public int banji;
	public char gan;
	public char sheng;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int sum;
		int tol = 0;
		int max = 0;
		student t = new student();
		student s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		s = (student)malloc(n * sizeof(student));
		for (i = 0;i < n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(*(s + i)).name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(*(s + i)).qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(*(s + i)).banji = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				(*(s + i)).gan = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				(*(s + i)).sheng = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				(*(s + i)).num = tempVar7;
			}
		  if (((*(s + i)).qimo > 80) && ((*(s + i)).num >= 1))
		  {
			  sum = sum + 8000;
		  }
		  if (((*(s + i)).qimo > 85) && ((*(s + i)).banji > 80))
		  {
			  sum = sum + 4000;
		  }
		  if ((*(s + i)).qimo > 90)
		  {
			  sum = sum + 2000;
		  }
		  if (((*(s + i)).qimo > 85) && ((*(s + i)).sheng == 'Y'))
		  {
			  sum = sum + 1000;
		  }
		  if (((*(s + i)).banji > 80) && ((*(s + i)).gan == 'Y'))
		  {
			  sum = sum + 850;
		  }
		  if (sum > max)
		  {
			  max = sum;
			  j = i;
		  }
		  tol = tol + sum;
		}
		System.out.printf("%s\n%d\n%d\n",(*(s + j)).name,max,tol);
	}
}

