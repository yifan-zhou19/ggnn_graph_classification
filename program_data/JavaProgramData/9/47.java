package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct
	//  {
	//	char ID[10];
	//	int a;
	//	int p;
	//  }
	//  s[100],t;
	 /* char ID[100][10];
	  int a[100];
	  int p[100];*/
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
			s[i].ID = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s[i].a = tempVar3;
		}
		s[i].p = i;
	  }

	  for (i = 1;i < n;i++)
	  {
		  for (j = i + 1;j <= n;j++)
		  {
			 if (((s[i].a < 60) && (s[j].a >= 60)) || ((s[i].a >= 60) && (s[j].a >= 60) && (s[i].a < s[j].a)) || ((s[i].a >= 60) && (s[j].a >= 60) && (s[i].a == s[j].a) && (s[i].p > s[j].p)) || ((s[i].a < 60) && (s[j].a < 60) && (s[i].p> s[j].p)))
			 {
				t = s[i];
				s[i] = s[j];
				s[j] = t;
			 }
		  }
	  }
	  for (i = 1;i <= n;i++)
	  {
		  System.out.printf("%s\n",s[i].ID);
	  }
	}
}

