public class book
{
  public String num = new String(new char[500]);
  public String s = new String(new char[50]);
  public book next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  book head;
	  book p1;
	  book p2;
	  int m;
	  int mi;
	  int i;
	  int j;
	  int k;
	  int max;
	  int found;
	  int[] aut = new int[26];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = (book)malloc(LEN);
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p1.num = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  p1.s = tempVar3.charAt(0);
	  }
	  for (i = 0;i < p1.s.length();i++)
	  {
		  aut[(p1.s).charAt(i) - 'A']++;
	  }
	  p1.next = null;

	  head = p2 = p1;

	  for (mi = 2;mi <= m;mi++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (book)malloc(LEN);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.num = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.s = tempVar5.charAt(0);
		}
		for (i = 0;i < p1.s.length();i++)
		{
		  aut[(p1.s).charAt(i) - 'A']++;
		}

		p2.next = p1;
		p2 = p1;
	  }
	  p2.next = null;

	  max = 0;
	  for (i = 0;i < 26;i++)
	  {
		  if (aut[i] > max)
		  {
			k = i;
			max = aut[i];
		  }
	  }

	  System.out.printf("%c\n",k + 65);
	  System.out.printf("%d\n",aut[k]);

	  p1 = head;
	  for (i = 1;i <= m;i++)
	  {
		found = 0;
		for (j = 0;j < p1.s.length();j++)
		{
			if ((p1.s).charAt(j) == k + 65)
			{
			  found = 1;
			  break;
			}
		}
		if (found == 1)
		{
			System.out.printf("%s\n",p1.num);
		}
		p1 = p1.next;
	  }
	}
}

