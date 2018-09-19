public class book
{
	public String name = new String(new char[20]);
  public int num;
  public book next;
}

package <missing>;

public class GlobalMembers
{
	  public static book creat(int m)
	  {
		  int i;
		  book head;
		  book p1;
		  book p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = (book)malloc(len);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  p1.num = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p1.name = tempVar2.charAt(0);
		  }
		  p1.next = null_Renamed;
		  head = p1;
		  p2 = p1;
		  for (i = 1;i < m;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (book)malloc(len);
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  p1.num = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  p1.name = tempVar4.charAt(0);
			  }
			  p1.next = null_Renamed;
			  p2.next = p1;
			  p2 = p1;
		  }
		  return (head);
	  }

	  public static void Main()
	  {

	  book p;
	  book head;
	  int i;
	  int[] a = new int[26];
	  int m;
	  String q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  head = creat(m);
	  p = head;
	  String s = new String(new char[30]);
	  for (i = 0;i < 26;i++)
	  {
	  a[i] = 0;
	  }
	  while (p != null)
	  {


		  i = 0;
		   s = p.name;
		   while (s.charAt(i) != '\0')
		   {
			   a[s.charAt(i) - 'A']++;
			   i++;
		   }
		  p = p.next;
	  }
	 /* for(i=0;i<26;i++)
	  printf("%d",a[i]);*/
	  //??

	  int max = 0;
	  int max_p;
	   for (i = 0;i < 26;i++)
	   {
		   if (a[i] > max)
		   {
			   max = a[i];
			   max_p = i + 'A';
		   }
	   }
	   System.out.printf("%c\n%d\n",max_p,max);
	   //find max

	   p = head;
	   int x = 0;
	   String c = new String(new char[20]);
	   while (p != null)
	   {

		  i = 0;
		   c = p.name;
		   while (c.charAt(i) != '\0')
		   {

			   if (c.charAt(i) == max_p)
			   {
				   x = 1;
			   }
			   i++;
		   }
		   if (x == 1)
		   {
			   System.out.printf("%d\n",p.num);
		   }
		   x = 0;
		  p = p.next;
			  //if(strchr(p->name,max_p)) printf("%d\n",p->num);
	   }
	   //??

	  }

}

