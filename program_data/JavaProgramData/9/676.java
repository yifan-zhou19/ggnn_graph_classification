public class person
{
	public String ID = new String(new char[10]);
 public int age;
}

package <missing>;

public class GlobalMembers
{
	public static person[] person = tangible.Arrays.initializeWithDefaultpersonInstances(100);
	public static void Main()
	{
		int i;
		int j = -1;
		int k;
		int n;
		int max;
		char[][] s = new char[100][10];
		String a = new String(new char[100]);
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
				person[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				person[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, person[i].age);
		  if (person[i].age >= 60)
		  {
			  j++;
		  }
		}
		for (k = 0;k <= j;k++)
		{
		   max = 0;
		 for (i = 0;i < n;i++)
		 {
			max = (max >= a.charAt(i))?max:a.charAt(i);
		 }
		 for (i = 0;i < n;i++)
		 {
			if (a.charAt(i) == max)
			{
				System.out.printf("%s\n",person[i].ID);
			 a = a.substring(0, i);
			   break;
			}
		 }
		}
		for (i = 0;i < n;i++)
		{
		if (person[i].age < 60)
		{
			System.out.printf("%s\n",person[i].ID);
		}
		}
	}
}

