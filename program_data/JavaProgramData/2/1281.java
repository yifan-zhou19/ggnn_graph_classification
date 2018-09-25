public class book
{
	public int n;
   public String name = new String(new char[26]);
   public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book head;
	public static int m;
	public static book creat()
	{
		book p1;
		book p2;
	 int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = (book)malloc(LEN);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p1.n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 p1.name = tempVar2.charAt(0);
	 }
	 head = null;
	 while (i < m - 1)
	 {
		 i = i + 1;
	 if (i == 1)
	 {
		 head = p1;
	 }
	 else
	 {
		 p2.next = p1;
	 }
	 p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = (book)malloc(LEN);
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 p1.n = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 p1.name = tempVar4.charAt(0);
	 }
	 }
	 p2.next = p1;
	 p1.next = null;
	 return (head);
	}
	public static void Main()
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int max = 0;
		int n;
		book p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int)calloc(26,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		creat();
		p1 = head;
		for (i = 65;i <= 90;i++)
		{
			p1 = head;
			do
			{
			for (j = 0;(p1.name).charAt(j) != '\0';j++)
			{
				if ((p1.name).charAt(j) == i)
				{
					*(p + i - 65) = *(p + i - 65) + 1;
				}
			}
			p1 = p1.next;
			}while (p1 != null);
		}
		for (i = 0;i < 26;i++,p++)
		{
			if (p > max)
			{
				max = p;
				n = i;
			}
		}
		System.out.printf("%c\n",n + 65);
		System.out.printf("%d\n",max);
		p1 = head;
		do
		{
		  for (j = 0;(p1.name).charAt(j) != '\0';j++)
		  {
			  if ((p1.name).charAt(j) == n + 65)
			  {
				  System.out.printf("%d\n",p1.n);
			  }
		  }
			p1 = p1.next;
		}while (p1 != null);
	}





}

