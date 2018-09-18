public class book
{
public int num;
public String name = new String(new char[27]);
public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book creat(int n)
	{
	 book head;
	 book p1;
	 book p2;
	 int m = 0;
	 head = p1 = p2 = null;
	 p1 = p2 = new book();
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p1.num = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 p1.name = tempVar2.charAt(0);
	 }
	 while (true)
	 {
	  m += 1;
	  if (m >= n)
	  {
		  break;
	  }
	  if (m == 1)
	  {
		  head = p1;
	  }
	  else
	  {
		  p2.next = p1;
	  }
	  p2 = p1;
	  p1 = new book();
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  p1.num = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  p1.name = tempVar4.charAt(0);
	  }
	 }
	p2.next = p1;
	  p2 = p1;
	 p2.next = null;
	 return (head);
	}



	public static void Main()
	{
	 book head;
	 book p;
		char maxchar;
	 int m;
	 int i = 0;
	 int max = 0;
	 int[] a = new int[26];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 head = creat(m);


	 for (p = head;p != null;p = p.next)
	 {
		 //printf("%d,%s\n",p->num,p->name);
	  for (i = 0;p.name.charAt(i) != '\0';i++)
	  {
	   int c = p.name.charAt(i) - 'A';
	   a[c]++;
	  }
	 }

	 for (i = 0;i < 26;i++)
	 {
	  if (a[i] > max)
	  {
	   max = a[i];
	   maxchar = 'A' + i;
	  }
	 }

	 System.out.printf("%c\n%d\n",maxchar,max);
	 for (p = head;p != null;p = p.next)
	 {
	  for (i = 0;p.name.charAt(i) != '\0';i++)
	  {
	   if (p.name.charAt(i) == maxchar)
	   {
		System.out.printf("%d\n",p.num);
		break;
	   }
	  }
	 }
	}


}

