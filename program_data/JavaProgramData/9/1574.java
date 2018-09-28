package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct br
	//	{
	//		  char id[10];
	//		  int age;
	//	}
	//	br[100], lr[100], temp;

		int i;
		int n;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0, j = 0; i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   br[i].id = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   br[i].age = tempVar3;
		   }
		   if (br[i].age >= 60)
		   {
			   lr[j] = br[i];
			   j++;
		   }
		}
		m = j;
		for (i = 1;i < m;i++)
		{
			 for (j = 1;j <= m - i;j++)
			 {
				if (lr[j].age > lr[j - 1].age)
				{
				   temp = lr[j - 1];
				   lr[j - 1] = lr[j];
				   lr[j] = temp;
				}
			 }
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",lr[i].id);
		}
		for (i = 0;i < n;i++)
		{
			if (br[i].age < 60)
			{
			   System.out.printf("%s\n",br[i].id);
			}
		}
	}
}

