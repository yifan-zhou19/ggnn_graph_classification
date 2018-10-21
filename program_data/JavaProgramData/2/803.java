//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class book
{
	public int num;
	public String writer = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		book * p = new book();
		book head;
		int n;
		int i;
		int j;
		int max;
		int maxi;
		int[] l = new int[26];
		int[] lnum = new int[999];
		void count(int l[0],struct book * p,int lnum);
		int read = struct book * p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		head = p = (book)calloc(n,sizeof(book));
		for (i = 0;i < n;i++,p++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: lnum[i]=read(p);
			lnum[i] = read(new book(p));
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=head;
		p.copyFrom(head);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: count(l,p,lnum[i]);
			count(l, new book(p), lnum[i]);
			p++;
		}
		max = l[0];
		maxi = 0;
		for (i = 1;i < 26;i++)
		{
			if (max < l[i])
			{
				max = l[i];
				maxi = i;
			}
		}
		System.out.printf("%c\n",65 + maxi);
		System.out.printf("%d\n",max);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=head;
		p.copyFrom(head);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < lnum[i];j++)
			{
				if (p.writer.charAt(j) == 65 + maxi)
				{
					System.out.printf("%d\n",p.num);
					break;
				}
			}
			p++;
		}
	}
	public static int read(book p)
	{
		int i = 0;
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = Integer.parseInt(tempVar);
		}
		d = System.in.read();
		d = System.in.read();
		do
		{
			p.writer = tangible.StringFunctions.changeCharacter(p.writer, i, d);
			i++;
		}while ((d = System.in.read()) != '\n');
		return (i);
	}
	public static void count(int[] l, book p, int lnum)
	{
		int i;
		for (i = 0;i < lnum;i++)
		{
			switch (p.writer.charAt(i))
			{
			case'A':
			l[0]++;
			break;
			case'B':
			l[1]++;
			break;
			case'C':
			l[2]++;
			break;
			case'D':
			l[3]++;
			break;
			case'E':
			l[4]++;
			break;
			case'F':
			l[5]++;
			break;
			case'G':
			l[6]++;
			break;
			case'H':
			l[7]++;
			break;
			case'I':
			l[8]++;
			break;
			case'J':
			l[9]++;
			break;
			case'K':
			l[10]++;
			break;
			case'L':
			l[11]++;
			break;
			case'M':
			l[12]++;
			break;
			case'N':
			l[13]++;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


