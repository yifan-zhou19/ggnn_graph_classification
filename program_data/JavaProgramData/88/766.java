public class data
{
	public char c;
	public data pt;
} //????????

package <missing>;

public class GlobalMembers
{
	public static data create() //??????
	{
		data head;
		data p1;
		data p2;

		p1 = p2 = new data(); //????
		head = p1;
		p1.c = System.in.read();

		for (;p2.c != '\n';) //?????
		{
			p1 = new data();
		p1.c = System.in.read();
		p2.pt = p1; //???p2???????
		p2 = p1;
		p2.pt = null;
		}

		return head;

	}
	public static void Main()
	{

		data headi;
		data ptr;
		int flag = 0;
		headi = create();

		for (ptr = headi;ptr != null;ptr = ptr.pt) //????
		{
			if ('9' >= ptr.c && '0' <= ptr.c)
			{
				System.out.print(ptr.c),flag++;
			}
			else
			{
				if (ptr.pt != null)
				{
					if ('9' >= ptr.pt.c && '0' <= ptr.pt.c && flag != 0)
					{
						System.out.print('\n');
					}
				}
			}
		}
	}
}
