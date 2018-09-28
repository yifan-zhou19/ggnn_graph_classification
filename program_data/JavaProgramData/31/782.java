public class L
{
 public char[][] a = new char[6][20];
 public L pq;
 public L ph;
}

package <missing>;

public class GlobalMembers
{
	public static L creat()
	{
	 L p1;
	 L p2;
	 L p3;
	 L head;
	 L end;
	 int i;
	 int j;
	 int k;
	 int l;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	 l = sizeof(L);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = head = (L)malloc(l);
	 p1.pq = null;
	 do
	 {
	  for (i = 0;i < 6;i++)
	  {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   p1.a[i] = tempVar.charAt(0);
	   }
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p2 = (L)malloc(l);
	  p3 = p2.pq = p1;
	  p1.ph = p2;
	  p1 = p2;
	 }while (p3.a[0][0] != 'e');
	 return p3.pq;
	}
	public static int Main()
	{
		L creat = new L();
	 int i;
	 int j;
	 L head;
	 L p1;
	 L p2;
	 p1 = head = creat();
	 do
	 {
		 for (i = 0;i < 6;i++)
		 {
		  if (i == 0)
		  {
			  System.out.printf("%s",p1.a[0]);
		  }
	   else
	   {
		   System.out.printf(" %s",p1.a[i]);
	   }
		 }
	  System.out.print("\n");
	  p1 = p1.pq;
	 }while (p1 != null);
	}
}

