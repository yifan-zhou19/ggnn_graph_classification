package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct photo
	//	  {
	//			 double high;
	//			 char sex[10];
	//	  }
	//	  p[43];
		  int n;
		  int i;
		  int i2;
		  int j = 0;
		  int k = 0;
		  double[] man = new double[43];
		  double[] woman = new double[43];
		  double hehe;
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
			  p[i].sex = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (p[i].high) = tempVar3;
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (strcmp(p[i].sex,"male") == 0)
			  {
			  man[j] = p[i].high;
			  j++;
			  }
			  else
			  {
				  woman[k] = p[i].high;
				  k++;
			  }
		  }
		  for (i = j - 2;i >= 0;i--)
		  {
			  for (i2 = 0;i2 <= i;i2++)
			  {
				  if (man[i2] > man[i2 + 1])
				  {
				  hehe = man[i2 + 1];
				  man[i2 + 1] = man[i2];
				  man[i2] = hehe;
				  }
			  }
		  }
		  for (i = k - 2;i >= 0;i--)
		  {
			  for (i2 = 0;i2 <= i;i2++)
			  {
				  if (woman[i2] < woman[i2 + 1])
				  {
				  hehe = woman[i2 + 1];
				  woman[i2 + 1] = woman[i2];
				  woman[i2] = hehe;
				  }
			  }
		  }
		  for (i = 0;i < j;i++)
		  {
		  System.out.printf("%.2f ",man[i]);
		  }
		  for (i = 0;i < k - 1;i++)
		  {
		  System.out.printf("%.2f ",woman[i]);
		  }
		  System.out.printf("%.2f",woman[i]);
	}

}

