public class m
{
	public int no;
	public int j;
  public String a = new String(new char[27]);

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int no;
		int[] ath = new int[26];
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * t;
	  String a = new String(new char[26]);
	  m head;
	  m p1;
	  m p2;
	  m tp;
	  m q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	  head = (m)calloc(n,L);
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  (head + i).no = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (head + i).a = tempVar3.charAt(0);
		  }
		(head + i).j = 0;
		for (t = (head + i).a; * t != '\0';t++)
		{
		 ath[*t - 'A']++;
		}
	  }
	  for (m = ath[0],k = 0,i = 1;i < 26;i++)
	  {
		  if (ath[i] > m)
		  {
			  k = i;
			  m = ath[i];
		  }
	  }
	  System.out.printf("%c",'A' + k);
	  m = 0;
	  for (i = 0;i < n;i++)
	  {
		  for (t = (head + i).a; * t != '\0';t++)
		  {
		 if (*t == ('A' + k))
		 {
			 (head + i).j = 1;
		   m++;
		   break;
		 }
		  }
	  }
	  System.out.printf("\n%d\n",m);
	  for (i = 0;i < n;i++)
	  {
		  if ((head + i).j == 1)
		  {
		   System.out.printf("%d",(head + i).no);
		 m--;
		 if (m > 0)
		 {
			 System.out.print("\n");
		 }
		  }
	  }
	}
}

