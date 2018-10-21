public class node //??????
{
	public int num;
	public String name = new String(new char[26]);
	public node next;
}
public class zuozhe
{
	public char name;
	public int[] books = new int[300];
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 1;
	public static int m;
	public static zuozhe[] zuozhe = tangible.Arrays.initializeWithDefaultzuozheInstances(26);

	public static node getlinked()
	{
		node head;
		node newnode;
		node thisnode;
	//	printf("Please input the number and data (-1 -1 to end):\n");
		do
		{
			newnode = new node(); //??????????
			if (newnode == null) //malloc???
			{
				System.out.print("malloc failed");
				System.exit(-1);
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				newnode.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				newnode.name = tempVar2.charAt(0);
			}
			newnode.next = null;
			if (n == 1) //???????????thisnode?head????newnode
			{
				thisnode = newnode;
				head = newnode;
			}
			else //?????????????
			{
				thisnode.next = newnode;
			}
			if (n <= m)
			{
				thisnode = newnode; //????
				n++; //????
			}
		}while (n <= m);
		return head;
	}
	public static void tongji(node p, int n)
	{
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < p.name.length();j++)
			{
				zuozhe[(p.name).charAt(j) - 'A'].books[zuozhe[(p.name).charAt(j) - 'A'].num] = p.num;
				zuozhe[(p.name).charAt(j) - 'A'].num++;
			}
			p = p.next;
		}
	}

	public static void bubble(zuozhe[] array, int n)
	{
		int i = 0;
		int pass;
		zuozhe temp = new zuozhe();

		for (pass = 1;pass <= n;pass++)
		{
			for (i = 0;i < n - pass;i++)
			{
				if (array[i].num < array[i + 1].num)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=array[i];
					temp.copyFrom(array[i]);
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		return;
	}

	public static void Main()
	{
		node p;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		p = getlinked();
		for (i = 0;i < 26;i++)
		{
			zuozhe[i].name = 'A' + i;
			zuozhe[i].num = 0;
		}
		tongji(p, m);
		bubble(zuozhe, 26);
		System.out.printf("%c\n%d\n",zuozhe[0].name,zuozhe[0].num);
		for (i = 0;i < zuozhe[0].num;i++)
		{
			System.out.printf("%d\n",zuozhe[0].books[i]);
		}
	}
}

