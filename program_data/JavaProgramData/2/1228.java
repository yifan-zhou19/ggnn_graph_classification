public class student
{
	public int num;
	public String s = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p2;
		student head;
		int n;
		int i;
		int j;
		int k;
		int m;
		int[] a = new int[100];
		String c = new String(new char[100]);
		char[][] nam = new char[100][100];
		for (i = 0;i < 26;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, i + 65);
			a[i] = 0;
		} //??
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = head = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.s = tempVar3.charAt(0);
		}
		for (i = 1;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.s = tempVar5.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		p1 = head;
		i = 0;
		while (p1 != null)
		{
			nam[i] = p1.s;
			i++;
			p1 = p1.next;
		}
		p1 = head;
		for (k = 0;k < n;k++)
		{
			//printf("%s\n",nam[k]);//????????nam[k]???????????????????????????????????????��?????//???��
			for (i = 0;i < 26;i++)
			{
				for (j = 0;nam[k][j] != '\0';j++)
				{
					if (nam[k][j] == c.charAt(i))
					{
						a[i]++;
					}
				}
			}

		}
		k = a[0];
			for (i = 0;i < 26;i++)
			{
				if (a[i] > k)
				{
					k = a[i];
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (a[i] == k)
				{
					System.out.printf("%c\n%d",c.charAt(i),a[i]);
					m = i;
					break;
				}
			}
			p1 = head;
			for (i = 0;i < n;i++)
			{
				for (j = 0;nam[i][j] != '\0';j++)
				{
					if (nam[i][j] == c.charAt(m))
					{
						System.out.printf("\n%d",p1.num);
					}
				}
				p1 = p1.next;

			}


	}

}

