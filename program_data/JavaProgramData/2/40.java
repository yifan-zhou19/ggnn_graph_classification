public class book
{
 public int a;
 public String b = new String(new char[30]);
 public book next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int k;
	 int m;
	 int max = 0;
	 int t;
	 char j;
	 char ch;
	 book head;
	 book p1;
	 book p2;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	 p1 = (book)calloc(1,sizeof(book));
	 head = p1;
	 for (i = 0;i < m;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  (p1.a) = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  p1.b = tempVar3.charAt(0);
	  }
	  p2 = p1;
	  if (i == m - 1)
	  {
	   p2.next = null;
	  }
	  else
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	   p1 = (book)calloc(1,sizeof(book));
	   p2.next = p1;
	  }
	 }
	 for (j = 'A';j <= 'Z';j++)
	 {
	 t = 0;
	 p1 = head;
	 while (p1 != null)
	 {
	  for (k = 0;k < p1.b.length();k++)
	  {
	   if ((p1.b).charAt(k) == j)
	   {
		t++;
	   }
	  }
	  p1 = p1.next;
	 }
	 if (t > max)
	 {
	  max = t;
	  ch = j;
	 }
	 }
	 System.out.printf("%c\n",ch);
	 System.out.printf("%d\n",max);
	 p1 = head;
	 while (p1 != null)
	 {
	  for (k = 0;k < p1.b.length();k++)
	  {
	   if ((p1.b).charAt(k) == ch)
	   {
		System.out.printf("%d\n",p1.a);
	   }
	  }
	  p1 = p1.next;
	 }
	}
}

