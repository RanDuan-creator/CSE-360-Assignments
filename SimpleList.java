// Ran Duan
// Class ID: 228
// CSE 360 Assignment #2
// Description: This class is to create the class SimpleList. Create and change 10 integer numbers in an array list.

public class SimpleList 
{
	private int[] list;
	private int count;
	
	public SimpleList()			//create an array to have 10 integer numbers.
	{
		this.count = 0;
		this.list = new int[10];
	}

	public void add(int num)
	{
		if (count >= 0) 			//Fill in the Numbers one by one.
		{
			list[count] = num;
			count ++;
		}
		else if (count == 10)		//When the list is full, the last number falls out the list.
		{
			for (int i = count; i >= 0; i--)
			{
				list[i+1] = list[i];
			}
		}
		else 
		{
			list[0] = num;
			count++;
		}
	}
	
	public void remove(int num)
	{
		int a = list.length;
		int rm = -1;
		for(int i=0; i<a; i++)
		{
			if (list[i]==num)
			{
				rm = i;			//when the parameter moves out, the others values move down.
				this.count--;
			}
		}
			if (rm != -1)
			{
				for(int i=rm;i<a-1;i++)
				{
					list[i] = list[i+1];
				}
				list[a-1]=0;
			}
	}
	
	public int count()
	{
		return this.count;
	}
	
	public String toString()
	{
		String str = "";				//return the list as string.
		for (int i = 0; i < count; i++) 
		{
			str += list[i];
	        if (i != count - 1) 
	        {
	        	str += " ";
	        }
		}
	    return str;
		
	}
	
	public int search(int num)
	{
		int r = -1;
		for (int i = 0; i < count; i++)
		{
			if(list[i] == num)
			{
				r = i;
			}
		}
		return r;				//if the parameter not in the list, return r = -1.
	}
	
}
